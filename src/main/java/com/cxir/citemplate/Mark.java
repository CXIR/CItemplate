package com.cxir.citemplate;

public class Mark {

    private String subject;
    private  float mark;

    public Mark( String subject,
                  float mark ) {

        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject( String subject ) {
        this.subject = subject;
    }

    public float getMark() {
        return mark;
    }

    public void setMark( float mark ) {
        this.mark = mark;
    }
}
