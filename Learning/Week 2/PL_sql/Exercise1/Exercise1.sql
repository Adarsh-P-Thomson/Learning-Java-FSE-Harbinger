DECLARE
    v_customer_id Customers.CustomerID%TYPE;
    v_dob Customers.DOB%TYPE;
    v_age NUMBER;
BEGIN
    FOR rec IN (SELECT c.CustomerID, c.DOB
                FROM Customers c
                JOIN Loans l ON c.CustomerID = l.CustomerID) LOOP
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Loan interest updated for customers above 60.');
END;
/
