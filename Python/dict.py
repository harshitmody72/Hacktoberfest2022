shop={'Apple':90,'orange':40};
print("Shop contents are : "+str(shop));
shop['chikku']=80;
shop['mango']=100;
print("After modifying the shop : "+str(shop));
shop['orange']=50;
shop['straw']=12;
print("After modification : "+str(shop));
# del shop['straw'];
result=shop.get('straw');
# print("Whether Straw is present ? ans -> "+str(result));
if result:
    print("Strawberry is present");
    print("Cost of the strawberry is : "+str(result));
else :
    print("Sorry, Strawberry is not available");





