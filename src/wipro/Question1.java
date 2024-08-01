package wipro;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Question1 {
    public static int maxXor(int lo, int hi, int k) {
        int maxXORValue = Integer.MIN_VALUE;
        for (int firstInteger = lo; firstInteger < hi; firstInteger++) {
            int secondInteger = hi;
            while (firstInteger < secondInteger) {
                final int currentXOR = firstInteger ^ secondInteger--;
                if (currentXOR > maxXORValue && currentXOR <= k){
                    maxXORValue = currentXOR;
                }
            }
        }
        return maxXORValue;
    }
}


interface IActions{
    public String unlockTheDoor();
    public String hackSecretPin(final String passcodeOfDoor) throws InterruptedException, ExecutionException;
    public String figureOutSafeDepositBoxNumber(final String passcodeOfDoor) throws InterruptedException, ExecutionException;
    public void openSafeDepositLock(final String safetyDespositBoxNumber, final String safetyDepositBoxPin);
    public boolean getRobberyVerdict();
}