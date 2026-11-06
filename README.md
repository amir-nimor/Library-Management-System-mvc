Library Management System
Project Description:
In this project, you will develop a simple Library Management System using Java and Spring MVC.
The system allows users to view the available books, see a book registration form, and submit new
books to the library.
You must complete the project in five phases. Each phase focuses on specific topics taught by your
instructor.
Phase 1 – Project Setup & Configuration
Tasks:
1. Configure your Maven project.
2. Run the Maven Life Cycle phases: validate, compile, test, package, verify, and install.
3. Configure Spring MVC using Java Configuration.
4. Create the main Spring configuration class.
5. Configure @Configuration, @EnableWebMvc, and @ComponentScan.
6. Create and configure an InternalResourceViewResolver using @Bean.
7. Create WebAppInitializer to configure the DispatcherServlet.

=========================================================================

Phase 2 – Application Architecture
Topics:
• Layered Architecture
• Model
• Repository
• Service
• Dependency Injection
• Constructor Injection
• Code to Interface
Tasks:
1. Create a Book model class with the following fields:
   o Long id
   o String title
   o String author
   o Integer publicationYear
2. Create a BookRepository interface.
3. Create BookRepositoryImpl and annotate it with @Repository.
4. Store book information in a static List.
5. Create a BookService interface.
6. Create BookServiceImpl and annotate it with @Service.
7. Inject the Repository into the Service using Constructor Injection.
8. Use @Autowired where required.


=============================================================================

Phase 3 – Book Pages & Controllers
Topics:
• @Controller
• @RequestMapping
• Model
• JSP
• ViewResolver
Tasks:
1. Create BookController.
2. Use @Controller and @RequestMapping.
3. Create a method to display all available books.
4. Use Model to send book information from the Controller to the JSP page.
5. Create a JSP page to display the list of books.
6. Use JSTL c:forEach to iterate over the books.
7. Create a link to navigate to the book registration form.


==============================================================================

Phase 4 – Adding New Books
Topics:
• @RequestParam
• POST Request
• ResponseEntity
• HTTP Headers
• HTTP Status Codes
Tasks:
1. Create a JSP page containing a form for registering a new book.
2. Receive the form data using @RequestParam.
3. Handle the form submission using RequestMethod.POST.
4. Create a method to receive the book title, author, and publication year.
5. Use the Service layer to save the new book.
6. Return an appropriate HTTP response using ResponseEntity.
7. Add a custom HTTP header to the response.
8. Use the appropriate HTTP status code.