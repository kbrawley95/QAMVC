
UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\starwars.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=1

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\batman.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=2

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\batmantank.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=3

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\itposter.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=4

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\darthvader.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=5

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\rose.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=6

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\godfather.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=7

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Desktop\godfatherlinks.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=8

select *
from Products