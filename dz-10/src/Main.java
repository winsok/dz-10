import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

      try {
          bankApplication.process("accountId000", 50, "USD");
      } catch (WrongAccountException wrongAccountException) {
          System.out.println("Account does not exist");
      } catch (WrongCurrencyException wrongCurrencyException) {
          System.out.println("Account has different currency");
      } catch (WrongOperationException wrongOperationException) {
          System.out.println("Not enough money");
      } catch (Exception exception) {
          System.out.println("Processing error. Try again.");
      } finally {
          System.out.println("Thank you for choosing our service");
      }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account has different currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Not enough money");
        } catch (Exception exception) {
            System.out.println("Processing error. Try again.");
        } finally {
            System.out.println("Thank you for choosing our service");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account has different currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Not enough money");
        } catch (Exception exception) {
            System.out.println("Processing error. Try again.");
        } finally {
            System.out.println("Thank you for choosing our service");
        }


        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account has different currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Not enough money");
        } catch (Exception exception) {
            System.out.println("Processing error. Try again.");
        } finally {
            System.out.println("Thank you for choosing our service");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException wrongAccountException) {
            System.out.println("Account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("Account has different currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("Not enough money");
        } catch (Exception exception) {
            System.out.println("Processing error. Try again.");
        } finally {
            System.out.println("Thank you for choosing our service");
        }
    }
}
