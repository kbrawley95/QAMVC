
UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\starwars.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=1

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\batman.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=2

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\batmantank.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=3

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\itposter.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=4

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\darthvader.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=5

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\rose.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=6

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\godfather.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=7

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GitHub\QAMVC\Images\DatabaseImages\godfatherlinks.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=8

select *
from Products