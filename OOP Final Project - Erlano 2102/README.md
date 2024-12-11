# *EvacuAid: Disaster Evacuation Management System* 

## **I. Project Overview**

**EvacuAid** is a Java console application designed to facilitate the registration and tracking of families during natural disasters. Traditional methods, such as using pen and paper, are prone to delays and inaccuracies, which can hinder disaster response efforts. EvacuAid addresses these challenges by providing a reliable and efficient system for families to register at evacuation centers. This ensures the collection of accurate data and supports the effective allocation of resources. The primary objective of EvacuAid is to enhance organization during evacuations, thereby minimizing confusion and improving the coordination of emergency responses.

The application allows individuals to input essential information, including family names, contact details, household members, and the assigned evacuation center. It incorporates data validation to ensure accuracy and permits corrections prior to finalizing the registration process. Once registration is complete, the system compiles a comprehensive list of all registered families for easy reference and monitoring. EvacuAid serves as a valuable tool for local authorities and disaster response teams, enabling them to manage evacuee information more efficiently and ensure a smoother and more secure evacuation process.

## **II. Application of Object-Oriented Programming Principles** 

 **Encapsulation**  
   - Data fields in classes like `Information`, `Contact`, and `Address` are private to protect sensitive information.  
   - Getters and setters are used to safely access and update the data, keeping it secure and organized.  

 **Inheritance**  
   - The program uses inheritance to build a structure that can be extended in the future. For example, shared properties across different classes can be inherited, making it easier to add features for specific user roles like staff or volunteers.  

 **Polymorphism**  
   - Methods in the program are designed to handle different types of data, allowing flexibility in how information is processed. This makes the program adaptable for future improvements or changes.  

 **Abstraction**  
   - The `StoredData` class simplifies how records are handled. Users can add and view family records without dealing with how the data is stored or managed behind the scenes.  

## **III. Sustainable Development Goal (SDG) and Its Integration**  

EvacuAid supports several Sustainable Development Goals (SDGs):  

 **SDG 11: Sustainable Cities and Communities**  
   - EvacuAid helps reduce the impact of disasters by ensuring evacuees are registered and tracked efficiently, making communities safer during emergencies.  

 **SDG 3: Good Health and Well-being**  
   - By identifying individuals who need special attention, such as medical care, EvacuAid ensures health and well-being are prioritized during disasters.  

 **SDG 16: Peace, Justice, and Strong Institutions**  
   - The system ensures fairness and transparency by maintaining accurate records and providing authorities with clear information to make decisions.  

 **SDG 13: Climate Action**  
   - EvacuAid strengthens disaster response for climate-related emergencies like floods and typhoons, helping communities prepare and recover effectively.  

## **IV. Instructions**

Follow these steps to run the EvacuAid Java console application:  

 **Follow the On-Screen Prompts**  
   - The program will display a welcome message explaining its purpose.  
   - Enter the required details step by step, such as family name, number of family members, and contact information.  
   - Verify the entered details, and confirm if they are correct.  

 **Register More Families**  
   - After successfully registering a family, the program will ask if you want to add another family.  
   - Choose "yes" to register another family or "no" to proceed to the summary of registered families.  

 **View Registered Families**  
   - At the end of the session, the program will display all the registered families along with their total count.  

 **Exit the Program**  
   - Once all families are registered, the program will close.  

