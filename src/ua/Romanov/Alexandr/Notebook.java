package ua.Romanov.Alexandr;

public class Notebook extends Computer {

    public static void main(String[] args) {
	Notebook notebook = new Notebook();
	notebook.setCostPrice((short) 200);
	notebook.setDisplaySupplier("Sumsung");
	notebook.setProcessorSupplier("AMD");
	notebook.setMotherBoardSupplier("Asus");
    notebook.setSerialNumber("4443566677");
    notebook.setExpenses(155);
    notebook.setProfit(305);
        System.out.println("Cost price: "+notebook.getCostPrice());
        System.out.println("Display supplier: "+notebook.getDisplaySupplier());
        System.out.println("Processor supplier: "+notebook.getProcessorSupplier());
        System.out.println("Motherboard supplier: " + notebook.getMotherBoardSupplier());
        System.out.println("Serial number: " + notebook.getSerialNumber());
        System.out.println("Expenses"+notebook.getExpenses());
        System.out.println("Profit: " + notebook.getProfit());
    }
}
