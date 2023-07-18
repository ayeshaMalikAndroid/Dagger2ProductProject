# Dagger2ProductProject
 Dagger 2
Dependency Injection in build upon the concept of Inversion of Control. Which says that a class should get its dependencies from outside. In simple words, no class should instantiate another class but should get the instances from a configuration class.
If a java class creates an instance of another class via the new operator, then it cannot be used and tested independently from that class and is called a hard dependency.
DI:injecting the services into clients from outside.
Classes doesn't create any of its own dependencies but instead only uses them.
supplying the class dependencies from outside so that, the class doesn't creates of its own dependencies.
Dependency Inversion:States that a class should depend on abstraction and not upon concretions(hard dependencies).
Single Respnosibility Principle(SRP):A class should have one and only one reason to change meaning that a class should have only one job.
Same objects can be shared across multiple clients.
One Network Client(Retrofit) object can be used for multiple different network related operations.
                                   Type of dependency Injection
Constructor Injection
Field Injection
Method Injection
Temporal coupling refers to a variety of dependences between program or system components that involve time.
Dagger is DI framework.
DI Framework:Automates the DI for any application
Implements the DI with few annotations and configurations.
@Module: is annotation used to construct the objects and provide the dependencies of the object 
@Provide: is used overt the each method of method of module class that will return object of each method/feature.
@Inject: is used over the fiels, constructor and method to get the instance of required class.
@Component: is an interface which acts bridge between @Module and @Inject alsi it return the builder for DaggerApp of Application.It contains all the module of all associated with component.
@Singleton: is used when module is an abstract class.Purpose of binds is very similar with Provides but Binds is more concise.
Auto generates code based on annotations that is compiled to App source code.
Auto generate code implements DI for object in source code.
