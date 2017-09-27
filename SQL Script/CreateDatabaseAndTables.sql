CREATE DATABASE QaCinema;
go 

use QaCinema
go

create table Customers(
CustomerID int not null,
FirstName varchar(50),
Surname varchar(50),
Address varchar(50),
City varchar(50),
Postcode varchar(50),
PhoneNo varchar(50),
Email varchar(50),
CardName varchar(50),
CardNumber varchar(50),
SecurityNo varchar(50),
ExpiryDate date,
primary key (CustomerID)
);

create table Products(
ProductID int not null,
Name varchar(50),
Size varchar(50),
Type varchar(50),
Description varchar(50),
Price double precision,
Colour varchar(50),
Image image,
PromotionalProduct bit,
primary key(ProductID)
);

create table OrderLine(
OrderLineID int not null,
OrderID int not null,
ProductID int not null,
Quantity int,
primary key(OrderLineID)
);

create table Orders(
OrderID int not null,
CustomerID int not null,
DeliveryTimes date,
GiftWrapped bit,
BillingAddress varchar(50),
BillingPostCode varchar(50),
primary key(OrderID),
);

alter table Orders
add constraint ORDER_CUSTOMER_FK foreign key(CustomerID) references Customers;

alter table OrderLine
add constraint ORDERLINE_PRODUCT_FK foreign key(ProductID) references Products;

alter table OrderLine
add constraint ORDERLINE_ORDER_FK foreign key(OrderID) references Orders;

