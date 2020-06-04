package connection;

public class FCB10BankProgram {

	private int bank;
	private int program;

	public FCB10BankProgram(int bank, int program) {
		this.bank = bank;
		this.program = program;
	}

	public FCB10BankProgram(int program) {
		program++;
		this.bank = program / 10;
		this.program = program % 10;
	}

	public int getBank() {
		return bank;
	}

	public int getProgram() {
		return program;
	}

}
