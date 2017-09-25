use QaCinema
go 

BULK
INSERT Customers
FROM 'C:\Users\Administrator\Desktop\QAMVC\SQL Script\Customer.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO

BULK
INSERT Products
FROM 'C:\Users\Administrator\Desktop\QAMVC\SQL Script\Product.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO

BULK
INSERT Orders
FROM 'C:\Users\Administrator\Desktop\QAMVC\SQL Script\Order.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO

BULK
INSERT OrderLine
FROM 'C:\Users\Administrator\Desktop\QAMVC\SQL Script\OrderLine.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO

