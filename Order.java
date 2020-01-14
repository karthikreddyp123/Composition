class Order{
    private Product product;
    public Order(int id,String name){
        product=new Product(id,name);
    }
    public void OrderDetails(){
        System.out.println("Order created for product:"+product.getName());
    }
}