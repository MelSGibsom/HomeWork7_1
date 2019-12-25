package ua.Romanov.Alexandr;

public class Computer {
    private String SerialNumber;
    private short CostPrice;
    private long expenses;
    private long profit;
    private String processorSupplier;
    private String motherBoardSupplier;
    private String DisplaySupplier;

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public void setCostPrice(short costPrice) {
        CostPrice = costPrice;
    }

    public void setExpenses(long expenses) {
        this.expenses = expenses;
    }

    public void setProfit(long profit) {
        this.profit = profit;
    }

    public void setProcessorSupplier(String processorSupplier) {
        this.processorSupplier = processorSupplier;
    }

    public void setMotherBoardSupplier(String motherBoardSupplier) {
        this.motherBoardSupplier = motherBoardSupplier;
    }

    public void setDisplaySupplier(String displaySupplier) {
        DisplaySupplier = displaySupplier;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public short getCostPrice() {
        return CostPrice;
    }

    public long getExpenses() {
        return expenses;
    }

    public long getProfit() {
        return profit;
    }

    public String getProcessorSupplier() {
        return processorSupplier;
    }

    public String getMotherBoardSupplier() {
        return motherBoardSupplier;
    }

    public String getDisplaySupplier() {
        return DisplaySupplier;
    }
}
