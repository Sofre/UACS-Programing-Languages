 class RoyalFamilyMember extends Person {
    private String title;
    RoyalFamilyMember(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

     @Override
     public void print() {
         super.print();
         System.out.println("Title: "+ title);
     }
 }
