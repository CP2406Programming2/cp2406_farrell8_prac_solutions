import java.util.Scanner;

public class CreateLoans implements LoanConstants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX = 5;
        Loan[] loan = new Loan[MAX];
        int x;
        int num;
        String name;
        double amt, rate;
        int loanType;
        int term;
        String outString = COMPANY + "\n";

        System.out.println("Welcome to " + COMPANY);
        System.out.print("Enter the current prime interest rate as a decimal number, for example, .05: ");
        rate = scanner.nextDouble();
        scanner.nextLine();

        for (x = 0; x < MAX; ++x) {
            System.out.print("Is this a (1) Business loan or (2) Personal loan: ");
            loanType = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter account number: ");
            num = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter name: ");
            name = scanner.nextLine();

            System.out.print("Enter loan amount: ");
            amt = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter term: ");
            term = scanner.nextInt();
            scanner.nextLine();

            if (loanType == 1) {
                BusinessLoan temp = new BusinessLoan(num, name, amt, term, rate);
                loan[x] = temp;
            } else {
                PersonalLoan temp = new PersonalLoan(num, name, amt, term, rate);
                loan[x] = temp;
            }
        }

        for (x = 0; x < MAX; ++x)
            outString += loan[x].toString() + "\n";

        System.out.println(outString);

        scanner.close();
    }
}
