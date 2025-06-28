CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR rec IN (SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings') LOOP
        UPDATE Accounts
        SET Balance = Balance + (rec.Balance * 0.01)
        WHERE AccountID = rec.AccountID;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/
