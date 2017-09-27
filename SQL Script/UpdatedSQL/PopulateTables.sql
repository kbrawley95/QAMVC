use QaCinema
go 

BULK
INSERT Customers 
FROM 'C:\Users\Administrator\Documents\GroupProject\Customer.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO

BULK
INSERT Products
FROM 'C:\Users\Administrator\Downloads\Product.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO

BULK
INSERT Orders
FROM 'C:\Users\Administrator\Downloads\Order.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO

BULK
INSERT OrderLine
FROM 'C:\Users\Administrator\Downloads\OrderLine.csv'
WITH
(
FIELDTERMINATOR = ',',
ROWTERMINATOR = '\n'
)
GO





