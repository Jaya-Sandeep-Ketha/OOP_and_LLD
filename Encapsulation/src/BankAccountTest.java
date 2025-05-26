import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance());

        // First withdrawal should succeed
        assertTrue(account.withdraw(50));

        // Second withdrawal exceeds balance, should fail
        assertFalse(account.withdraw(100));
    }
}
