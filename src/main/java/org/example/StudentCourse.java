package org.example;

public class StudentCourse {
    int id;
    int [] courserList;

    StudentCourse(int _id, int[] cs){
        id=_id;
        courserList=cs;
    }
    public void addCourseId (int _id,int cs){

        int [] newList = new int[courserList.length+1];
        for (int i=0;i<courserList.length;i++){
            newList[i]=courserList[i];
        }
        newList[courserList.length]= cs;
        id = _id;
    }


}
