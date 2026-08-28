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