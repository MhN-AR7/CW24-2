## Q1
## Shipping Management System
Problem Statement
Suppose you are developing an online store that needs to calculate the shipping cost
of customer orders.
The store supports different shipping methods:
• Standard Shipping
• Express Shipping
• Same-Day Shipping
Each shipping method has its own way of calculating the shipping cost.
For example, the final shipping cost may depend on the order weight and the selected
shipping method.
The current system should be designed in a way that allows new shipping methods to
be added in the future without making the existing code complicated.
Requirements
Create a simple shipping management system that can:
• Calculate the shipping cost for an order.
• Support the three shipping methods mentioned above.2
• Allow the shipping method to be changed when needed.
• Make it possible to add another shipping method without modifying the main
shipping logic.
Create a small Order model containing at least the following information:
• Order ID
• Weight
Then create a simple test program that demonstrates the different shipping methods
and their calculated costs.
Example
For an order with:
Order ID: 101
Weight: 5 kg
The system should be able to calculate the shipping cost using:
Standard Shipping
Express Shipping
Same-Day Shipping
The exact pricing rules are up to you.
Constraints
• Avoid putting all shipping methods inside one large conditional structure.
• The main shipping logic should not need to know the internal details of each
shipping method.
• The design should make it easy to introduce a new shipping method


## Q2
## Remote Control System
Problem Statement
Suppose you are developing a simple Smart Home Remote Control.
The remote control can control different devices in a house.
Currently, the system has the following devices:
• Light
• TV
• Air Conditioner
Each device supports different operations.
For example:
Light
- Turn On
- Turn Off
  TV
- Turn On
- Turn Off
  Air Conditioner
- Turn On
- Turn Off
  The remote control should be able to execute different operations on these devices.4
  The system should be designed so that the remote control does not need to know the
  details of the devices it controls.
  Requirements
  Create a Smart Home Remote Control system that can:
  • Turn devices on and off.
  • Work with the Light, TV, and Air Conditioner.
  • Allow different operations to be assigned to the remote control.
  • Execute the assigned operation when a button is pressed.
  • Make it possible to add new devices or operations in the future.
  Create a small test program demonstrating several operations using the remote
  control.
  Example
  The following operations should be possible:
  Turn Light On
  Turn Light Off
  Turn TV On
  Turn TV Off
  Turn Air Conditioner On
  Turn Air Conditioner Off
  Expected output can be similar to:
  Light is ON5
  Light is OFF
  TV is ON
  TV is OFF
  Air Conditioner is ON
  Air Conditioner is OFF
  Constraints
  • The remote control should not contain conditional logic for each device.
  • The remote control should not directly depend on specific device
  implementations.
  • The design should allow new commands or devices to be added without
  significantly changing the remote control.


## Q3
## Online Order Management System
Problem Statement
Suppose you are developing an online shopping system where customers can place
orders.
An order can have different statuses during its lifecycle:
• New
• Paid
• Shipped
• Delivered
• Cancelled
The behavior of an order depends on its current status.6
For example, a new order can be paid or cancelled. A paid order can be shipped, but a
cancelled order cannot be shipped or paid.
As the order moves through different stages, the operations that can be performed on
it also change.
The system should be designed in a way that keeps the order management logic
simple and makes it easy to introduce new statuses in the future.
Requirements
Create a simple order management system that supports:
• Creating an order
• Paying for an order
• Shipping an order
• Delivering an order
• Cancelling an order
The system should handle valid and invalid operations according to the current status
of the order.
For example:
New → Pay
Paid → Ship
Shipped → Deliver
New → Cancel
Some operations should not be allowed depending on the current status.
For example:
Cancelled → Pay
Cancelled → Ship7
Delivered → Cancel
New → Deliver
The system should provide an appropriate message when an invalid operation is
attempted.
Example
A possible sequence:
Pay
Ship
Deliver
Cancel
Possible output:
Order paid successfully.
Order shipped successfully.
Order delivered successfully.
Cannot cancel a delivered order.
Create a small test program that demonstrates different order states and operations.
Constraints
• Avoid putting all status-related behavior inside one large conditional structure.
• The order should behave differently depending on its current status.
• The design should make it easy to add another order status in the future.


## Q4
Food Delivery System
Problem Statement
Suppose you are developing a simple Food Delivery System.
Customers can place food orders from a restaurant. After an order is created, it goes
through different stages during its lifecycle.
An order can have different statuses:
• New
• Confirmed
• Preparing
• Ready
• Delivered
• Cancelled
The behavior of the order depends on its current status.
The system also supports different delivery methods:
• Bike Delivery
• Car Delivery
• Express Delivery
Each delivery method calculates its delivery cost differently.
The system should also support different actions that can be performed on an order,
such as:
• Confirm Order
• Cancel Order
• Start Preparing9
• Mark as Ready
• Deliver Order
These actions may be requested and executed independently.
Requirements
Design and implement a simple Food Delivery System that:
• Allows creating an order.
• Allows changing the order status through valid operations.
• Prevents invalid operations depending on the current status.
• Supports different delivery methods.
• Calculates the delivery cost according to the selected delivery method.
• Allows order operations to be executed independently.
• Makes the system easy to extend with new order statuses, delivery methods,
and operations.
Example
A possible order lifecycle:
New
↓
Confirmed
↓
Preparing
↓
Ready
↓10
Delivered
Another possible scenario:
New
↓
Cancelled
For example, the following operations should behave differently depending on the
current order status:
New → Confirm
Confirmed → Start Preparing
Preparing → Mark as Ready
Ready → Deliver
Delivered → Cancel
The system should provide an appropriate message when an invalid operation is
attempted.
For example:
Cannot cancel a delivered order.
Cannot deliver an order that is not ready.
The delivery cost should also depend on the selected delivery method.
For example:
Bike Delivery → $5
Car Delivery → $8
Express Delivery → $12
The exact pricing rules are up to you.11
Constraints
• Avoid large conditional structures for handling order statuses.
• Avoid large conditional structures for handling delivery methods.
• The component responsible for executing an order operation should not need
to know the internal details of the order.
• The design should allow new statuses, delivery methods, and operations to be
added with minimal changes to existing code.
Example Scenario
Create an order with ID 101.
Then perform the following operations:
Confirm Order
Start Preparing
Mark as Ready
Deliver Order
Select a delivery method and calculate the delivery cost.
Finally, try to cancel the delivered order and handle the result appropriately