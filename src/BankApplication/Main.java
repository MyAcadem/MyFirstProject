package BankApplication;

class Main {



     /*   public static void main(String[] args) throws IOException{

            List<AccountClass> data = null;

            System.out.println("******************** DUO TECH BANK ACCOUNT MANAGEMENT APPLICATION ********************");

            System.out.println("-------------------------------------------------------------------------------------");



            boolean userChoice = false;

            Scanner input = new Scanner(System.in);



            do {



                System.out.print("Please enter the name of the file to load : ");

                String path = input.next();

                System.out.println("-------------------------------------------------------------------------------------");



                System.out.println("All the information has been loaded and accounts are being generated...");

                System.out.println("-------------------------------------------------------------------------------------");



                System.out.println("Here's the list of bank accounts that have been created:");

                System.out.println("-------------------------------------------------------------------------------------");



                try {


                    data = Utility.readFromCSV(path);

                }

                catch (FileNotFoundException e) {

                    throw new RuntimeException(e);

                }

//            for (Account account : data) {
//
//                System.out.println(account.showInfo());

                data.forEach(account -> System.out.println(account.showInfo()));{

                    System.out.println("-------------------------------------------------------------------------------------");

                }

                Collection<AccountClass> accounts = new ArrayList<>();


//            for (Account account: accounts) {
//
//                System.out.println(account.showInfo());

                accounts.forEach(account -> System.out.println(account.showInfo()));{
                    System.out.println("******************************************************************");



                }



                System.out.print("Would you like to load another file? (Y/N)");

                userChoice = input.next().equalsIgnoreCase("y");



            } while(userChoice);



            System.out.println("THANK YOU FOR USING DUO TECH BMA! GOODBYE!");

        }

    }*/


}
