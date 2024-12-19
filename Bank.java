package day16;

public class Bank {
	private int acNumber ;
    private String acName;
    private double acBalance;
    private int acPIN;

    public Bank() {
    }

    public Bank(int acNumber, String acName, double acBalance, int acPIN) {
        this.acNumber = acNumber;
        this.acName = acName;
        this.acBalance = acBalance;
        this.acPIN = acPIN;
    }

    public int getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(int acNumber) {
        this.acNumber = acNumber;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
    }

    public int getAcPIN() {
        return acPIN;
    }

    public void setAcPIN(int acPIN) {
        this.acPIN = acPIN;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "acNumber=" + acNumber +
                ", acName='" + acName +
                ", acBalance=" + acBalance +
                '}';
    }
}


