package org.la.test.code.codility;

import java.math.BigInteger;

public class FileMemoryManagement {

    public static void main(String[] args) {

        String s =    "my.song.mp3 11b"
                    + "\ngreatSong.mp3.flac 1000b"
                    + "\ngreatSong.flac 1000b"
                    + "\nnot3.txt 5b"
                    //+ "\nvideo.mp4 200b"
                    //+ "\ngame.exe 100b"
                    //+ "\nvideo.dddd.mp4 200b"
                    //+ "\ngame.eeee.exe 100b"
                    //+ "\nvinot3.txt.mp4 200b"
                    + "\nimage1.txt.jpg 200b"
                    + "\nimage2.txt.bmp 100b"
                    //+ "\nga.mp3.exe 100b"
                    + "\nmov!e.mkv 10000b";
        s = "";
        //System.out.println(s);
        //Arrays.stream(s.split("\n")).forEach(e -> System.out.println("res: "+e));
        FileMemoryManagement fileMemoryManagement = new FileMemoryManagement();
        String result = fileMemoryManagement.solution(s);
        System.out.println(result);
    }


    BigInteger audioFileSize = null;
    BigInteger movieFileSize = null;
    BigInteger imageFileSize = null;
    BigInteger otherFileSize = null;

    public String solution(String s) {

        String[] allFilesNameSizeArr = s.split("\n");
        typeFilter(allFilesNameSizeArr);

//        System.out.println("audioFileSize: "+audioFileSize);
//        System.out.println("movieFileSize: "+movieFileSize);
//        System.out.println("imageFileSize: "+imageFileSize);
//        System.out.println("otherFileSize: "+otherFileSize);

        StringBuilder sb = new StringBuilder("music "+(audioFileSize==null?"0":audioFileSize)+"b\n");
        sb.append("images "+(imageFileSize==null?"0":imageFileSize)+"b\n");
        sb.append("movies "+(movieFileSize==null?"0":movieFileSize)+"b\n");
        sb.append("other "+(otherFileSize==null?"0":otherFileSize)+"b");

        return sb.toString();
    }

    void typeFilter(String allFilesNameSizeArr[]){
        for(int i=0 ; i<allFilesNameSizeArr.length ; i++){
            String[] nameSize = allFilesNameSizeArr[i].split(" ");
            int li = nameSize[0].lastIndexOf('.');
            String ext = nameSize[0].substring(li+1);
            consolidateTypeWithSize(ext, nameSize[1].substring(0, nameSize[1].length()-1));
        }
    }

    void consolidateTypeWithSize(String ext, String sizeInBytes){

        //audio
        if (ext.equalsIgnoreCase("mp3") || ext.equalsIgnoreCase("aac") || ext.equalsIgnoreCase("flac")){
            if(audioFileSize==null){
                audioFileSize = new BigInteger(sizeInBytes);
            }
            else{
                audioFileSize = audioFileSize.add(new BigInteger(sizeInBytes));

            }
        }
        //movie
        else if (ext.equalsIgnoreCase("mp4") || ext.equalsIgnoreCase("avi") || ext.equalsIgnoreCase("mkv")){
            if(movieFileSize==null){
                movieFileSize = new BigInteger(sizeInBytes);
            }
            else{
                movieFileSize = movieFileSize.add(new BigInteger(sizeInBytes));

            }
        }
        //image
        else if (ext.equalsIgnoreCase("jpg") || ext.equalsIgnoreCase("bmp") || ext.equalsIgnoreCase("gif")){
            if(imageFileSize==null){
                imageFileSize = new BigInteger(sizeInBytes);
            }
            else{
                imageFileSize = imageFileSize.add(new BigInteger(sizeInBytes));

            }
        }
        //others
        else {
            if(otherFileSize==null){
                otherFileSize = new BigInteger(sizeInBytes);
            }
            else{
                otherFileSize = otherFileSize.add(new BigInteger(sizeInBytes));

            }
        }
    }

}
