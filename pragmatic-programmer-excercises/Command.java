package net.hopbit.book.pragmatic_programmer;

public class Command {
	
	public Command(char c, int arg2, String string) {
		cmd = c;
		hasArg = arg2;
		func = string;
	}
	private static final int ARG = 1;
	private static final int NO_ARG = 0;

	char cmd; /* the command letter */
	int hasArg; /* does it take an argument */
	String func;/* routine to call */
	
	static Command cmds[] = {
		new Command('P', ARG, "doSelectPen") ,
		new Command('U', NO_ARG, "doPenUp") ,
		new Command('D', NO_ARG, "doPenDown") ,
		new Command('N', ARG, "doPenDir") ,
		new Command('E', ARG, "doPenDir") ,
		new Command('S', ARG, "doPenDir") ,
		new Command('W', ARG, "doPenDir") 
	};

	public char getCmd() {
		return cmd;
	}

	public void setCmd(char cmd) {
		this.cmd = cmd;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public int getHasArg() {
		return hasArg;
	}

	public void setHasArg(int hasArg) {
		this.hasArg = hasArg;
	}
}
