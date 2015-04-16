package com.redux.kumardivyarajat.parsedemo;

import com.parse.ParseFile;

/**
 * Created by kumardivyarajat on 15/04/15.
 */
public class Students {

    String Name, USN, Semester;
               ParseFile pic;

    Students () {

    };

    public Students(String name, ParseFile n, String semester, String USN) {
        Name = name;
        this.pic = n;
        Semester = semester;
        this.USN = USN;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ParseFile getPic() {
        return pic;
    }

    public void setPic(ParseFile pic) {
        this.pic = pic;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUSN() {
        return USN;
    }

    public void setUSN(String USN) {
        this.USN = USN;
    }
}
