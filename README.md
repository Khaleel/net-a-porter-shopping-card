
# Net-A-Porter Shop in Scala (Exercise)

The Shop has been implemented as a command-line application. Exercises followd as:

* Parse the product-data.csv file to read the product data
* Implement the "list" action to show which products can be purchased
* Implement the ability to add a product to the basket
* Implement the ability to remove a product from the basket
* Implement the ability to get the total value of the basket

When running, the Application will shows a list of options, and read the input and invoke the appropriate partially implemented method.

## To run the application:

```
sbt test
sbt run
```


### To cleanup and remove the target directory

```
sbt clean 
```
or
```
find . -name target -type d -exec rm -rf {} \;
```

## Running Test

```
iman$ sbt test
[info] Loading project definition from /www/netaporter-shop/project
[info] Set current project to netaporter-shop (in build file:/www/netaporter-shop/)
[info] CSVReaderTest:
[info] - testing CSV import - Parsing the product-data.csv data file
[info] - CSVReader Mock
[info] ValidatorTest:
[info] - testing validator - validate range in between 3 to 9 
[info] - testing out of range - invalid range in between 9 and total of 5 
[info] - testing out of range - minus int added 
[info] - Validator Mock
[info] NetAPorterShopTest:
[info] - test load products
[info] - test listing products
[info] - test add product into basket
[info] - test remove product from basket
[info] - test total
[info] - test total - empty basket
[info] - NetAPorterShop Mock
[info] ApplicationTest:
[info] I want to be able to load products from CSV file 
[info] And I want to be able to show which products can be purchased as a list 
[info] And I want to be able to add product to basket by ID 
[info] And I want to get the total amount for the added product 
[info] And I should be able to remove product by ID 
[info] Then I want to get the total amount for an empty basket 
[info] Feature: Application object
[info]   Scenario: Create an object with list of products
[info]     Given a CSV file is loaded and a product list created 
[info]     Then the human readable list should created 
[info]     Then Adding a few products to basket 
[info]     Then Remove product from basket 
[info]     Then Get total 
[info]     Then Get total - empty basket 
[info] Run completed in 547 milliseconds.
[info] Total number of tests run: 14
[info] Suites: completed 4, aborted 0
[info] Tests: succeeded 14, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 2 s, completed 29-Jun-2015 13:36:17
```

## Running Shop

```
iman$ sbt run
[info] Loading project definition from /www/netaporter-shop/project
[info] Set current project to netaporter-shop (in build file:/www/netaporter-shop/)
[info] Running com.netaporter.main.Application 
************************************
* Welcome to the Net-A-Porter Shop *
************************************
Enter "Q" to Quit
Enter "add <ProductId>" to add to basket
Enter "remove <ProductId>" to remove from basket
Enter "list" to show a list of products in the inventory
Enter "total" to show the total price of the basket
list 
1 Short Sleeve Jumper £9.99,
2 Shoulder Bag £9.99,
3 Skinny Jeans £45.00,
4 Leather Jeans £80,
5 Leather Jacket £199.99,
6 Wool Socks  £20.50,
7 Piqué Polo shirt  £50.55
add 2
Item #2 was added to your basket
add 7
Item #7 was added to your basket
total
£60.54
```


