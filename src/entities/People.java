package entities;

public class People {

  private String name;
  private int age;
  private String job;

  public People(String name, int age, String job) {
    this.name = name;
    this.age = age;
    this.job = job;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getJob() {
    return job;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public String toString() {
    return "name=" + name + ", age=" + age + ", job=" + job;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    People other = (People) obj;
    if (name == null) {
        return other.name == null;
    } else return name.equals(other.name);
  }

}
