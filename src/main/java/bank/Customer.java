package bank;

public class Customer {

  public Customer(int id, String name, String userName, String password, int accountId) {
    setId(id);
    setName(userName);
    setUsername(userName);
    setPassword(password);
    setAccountId(accountId);
  }

  private int id;
  private int accountId;
  private String name;
  private String username;
  private String password;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
