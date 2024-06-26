package WeeklyQuiz.Sms;

public class Electronics extends Product {
  private String brand;

  public Electronics(String name, int price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public int calculatePrice() {
    if (brand.equals("Apple")) {
      return (int) ((super.getPrice() * 1.2) / 10 * 10); // 20프로 추가 + 1원짜리 없애기
    }
    return super.calculatePrice();
  }
}
