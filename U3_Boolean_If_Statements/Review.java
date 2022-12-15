package U3_Boolean_If_Statements;

public class Review {
    private String name;
    private String restaurant;
    private int rating;

    public Review(String name, String restaurant, int rating){
      this.name = name;
      this.restaurant = restaurant;
      this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString(){
        String output = name + ", " + restaurant + ", " + rating;

        if(rating == 5){
            output += "\n\t** Highly Recommended";
        }
        else if(rating == 1){
            output += "\n\t** Strongly Discouraged";
        }
        return output;
    }
}
