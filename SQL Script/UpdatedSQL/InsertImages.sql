
UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\starwars.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=1

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\batman.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=2

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\batmantank.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=3

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\itposter.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=4

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\darthvader.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=5

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\rose.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=6

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\godfather.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=7

UPDATE dbo.Products
SET image = 
    (SELECT  BulkColumn FROM OPENROWSET(BULK  N'C:\Users\Administrator\Documents\GroupProject\DatabaseImages\godfatherlinks.jpg', SINGLE_BLOB) AS x)
WHERE ProductID=8

select *
from Products