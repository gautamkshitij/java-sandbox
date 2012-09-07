package net.hopbit.book.pragmatic_programmer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang.StringUtils;

public class CommantMain {

	static String path = "D:\\dev\\rls\\dev.hopbit.net\\src\\net\\hopbit\\dev\\learn\\" +
			"books\\pragmatic_programmer\\";
	static String inputFileName = "fileToParse.txt";
	static String outputFileName = "outputFile.txt";
	
	public static void main(String[] args) throws Exception {
		
		StringBuffer sb = new StringBuffer();
		FileInputStream fis = null;
		DataInputStream in = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(path+inputFileName);
			in = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(in));
		} catch (Exception e) {
			System.out.println("File not found."+e);
			throw e;
		}
		
		boolean flag = true;
		String buff = null;
		
		while (flag) { // buff -> np. P 2

			Command cmd = null;
			try {
				buff = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				flag=false;
			}
			
			if(StringUtils.isNotBlank(buff)) {
				cmd = findCommand(buff);
			} else {
				flag = false;
			}

			if (cmd!=null) {
				//int arg = 0 ;
				String substr = null;
				if(buff.length()>1) 
					substr = buff.substring(2,buff.length());
					
				if (cmd.getHasArg()==1 && StringUtils.isBlank(substr)) {
					System.out.println(cmd.getCmd() + " needs an argument\n" );
					continue;
				}
				sb.append(cmd.getFunc());
				sb.append("(");
					
				if (cmd.getHasArg()==1 && StringUtils.isNotBlank(substr)) {
					sb.append(buff.substring(2, buff.length()));
				}

				sb.append(")");
				sb.append("\n");
			}
		}
		
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter(path+outputFileName));
			out.write(sb.toString());
			out.close();
		} catch (IOException e) {
			System.out.println("Exception ON WRITE FTO FILE");
		}
		
		
	}
	
	private static Command findCommand(String buff) {
		int i;
		for (i=0; i<Command.cmds.length; i++) {
			if (buff.contains(String.valueOf((Command.cmds[i].getCmd())) )) {
				return Command.cmds[i];
			}
		}
		
		System.out.printf("Unknown command '%c'\n", buff);
		System.out.println();
		
		return null;
	}

}
