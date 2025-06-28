ALTER TABLE Customers ADD IsVIP VARCHAR2(5);
BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('VIP flag set for eligible customers.');
END;
/
