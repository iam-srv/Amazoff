# Amazoff

Amazoff is the new and coming delivery service the main purpose of the application is that at the end of each day, the delivery schedule for the next day is decided.
There are some orders that need to be delivered and some delivery partners who will deliver the orders. Following points will help you understand the working of Amazoff:

Orders:
Each order has a unique orderId and a delivery time (in the 24-hour HH:MM format). This means that the order with the given Id needs to be delivered exactly at HH:MM on the next day.
Each order is assigned to at most one delivery partner. This means that either the order is assigned to exactly one delivery partner or it is left unassigned.
Delivery Partner:
Each delivery partner has a unique partnerId.
Any (possibly zero) number of orders can be assigned to a delivery partner.
A simple spring boot application can support all of the given CRUD operations. 
