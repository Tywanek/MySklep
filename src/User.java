public class User {
    private String userName;
    private int userAge;

    public User(UserBuilder builder) {
        this.userName = builder.userName;
        this.userAge = builder.userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public static class UserBuilder {
        private String userName;
        private int userAge;

        public UserBuilder() {
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserAge(int userAge) {
            this.userAge = userAge;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
