# Unit-2-Store-Management-Project
Simulation of a business using Javalab
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. (This UML was just a rough draft, not all of the information written in the UML Diagram made it into the final project.)

![UML Diagram for my project](UML.png)

## Description

Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is used to output information for your store in the console.

I made a phone store for this project, with iPhone and Android being subclasses of the Phone superclass. The iPhone and Android subclasses had the data from the Phone superclass inherited to them and had their own data given as well. My project also has user input, which gives them questions based on their responses. For example, if the user inputs iPhone as their type of phone, the app will ask them what iOS Update it's currently on and if it uses a lightning cable (due to the shift from lightning to type c in September 2023). If the user enters Android for their phone type, the app just asks them for their update version (no need to ask for the charger type as Android has always been using type c). 

