package com.bis.cloudphone.design.responsibility;

public class Request {

    private boolean frequency;

    private boolean logged;

    public Request(boolean frequency, boolean logged) {
        this.frequency = frequency;
        this.logged = logged;
    }

    public boolean isFrequency() {
        return frequency;
    }

    public boolean isLogged() {
        return logged;
    }

    static class Builder{
        private boolean frequency;

        private boolean logged;

        public boolean isFrequency() {
            return frequency;
        }

        public Builder setFrequency(boolean frequency) {
            this.frequency = frequency;
            return this;
        }

        public boolean isLogged() {
            return logged;
        }

        public Builder setLogged(boolean logged) {
            this.logged = logged;
            return this;
        }

        public Request build(){
            return new Request(frequency , logged);
        }
    }
}
