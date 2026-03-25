class BankApplication {

    void process() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        BankApplication b = new BankApplication();

        try {
            b.process();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
