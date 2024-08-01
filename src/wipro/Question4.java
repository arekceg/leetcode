package wipro;

import java.util.concurrent.*;

public class Question4 {
    public void rob(IActions actions) throws InterruptedException, ExecutionException {
        String passcode = actions.unlockTheDoor();
        CompletableFuture<String> hackPin = CompletableFuture.supplyAsync(() -> {
            try {
                return actions.hackSecretPin(passcode);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<String> getDepositNumber = CompletableFuture.supplyAsync(() -> {
            try {
                return actions.figureOutSafeDepositBoxNumber(passcode);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        actions.openSafeDepositLock( getDepositNumber.get(), hackPin.get());
    }

    interface IActions {
        public String unlockTheDoor();

        public String hackSecretPin(final String passcodeOfDoor) throws InterruptedException, ExecutionException;

        public String figureOutSafeDepositBoxNumber(final String passcodeOfDoor) throws InterruptedException, ExecutionException;

        public void openSafeDepositLock(final String safetyDespositBoxNumber, final String safetyDepositBoxPin);

        public boolean getRobberyVerdict();
    }
}
