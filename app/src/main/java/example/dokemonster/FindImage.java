package example.dokemonster;

public class FindImage {
    //stage img 선정
    public int selectStageImg(int stage_cnt){

        //switch를 통해 해당하는 이미지 id return
        if (stage_cnt < 3)
            return R.drawable.stage_1;
        else if (stage_cnt >= 3 && stage_cnt < 6)
            return R.drawable.stage_2;
        else if (stage_cnt >=6 && stage_cnt < 9)
            return R.drawable.stage_3;

        //이제 게임끝
        return 0;
    }

    //board_init image
    public int selectBoard_init_img(int num){
        int init_img = 0;
        switch (num){
            case 1:
                init_img =  R.drawable.board_init_1;
                break;
            case 2:
                init_img =  R.drawable.board_init_2;
                break;
            case 3:
                init_img =  R.drawable.board_init_3;
                break;
            case 4:
                init_img =  R.drawable.board_init_4;
                break;
            case 5:
                init_img =  R.drawable.board_init_5;
                break;
            case 6:
                init_img =  R.drawable.board_init_6;
                break;
            case 7:
                init_img =  R.drawable.board_init_7;
                break;
            case 8:
                init_img =  R.drawable.board_init_8;
                break;
            case 9:
                init_img =  R.drawable.board_init_9;
                break;
            case 10:
                init_img =  R.drawable.board_init_10;
                break;
            case 11:
                init_img =  R.drawable.board_init_11;
                break;
            case 12:
                init_img =  R.drawable.board_init_12;
                break;
            case 13:
                init_img =  R.drawable.board_init_13;
                break;
            case 14:
                init_img =  R.drawable.board_init_14;
                break;
            case 15:
                init_img =  R.drawable.board_init_15;
                break;
            case 16:
                init_img =  R.drawable.board_init_16;
                break;
        }
        return init_img;
    }

    //board image
    public int selectBoard_img(int num){
        int init_img = 0;
        switch (num){
            case 1:
                init_img =  R.drawable.board_1;
                break;
            case 2:
                init_img =  R.drawable.board_2;
                break;
            case 3:
                init_img =  R.drawable.board_3;
                break;
            case 4:
                init_img =  R.drawable.board_4;
                break;
            case 5:
                init_img =  R.drawable.board_5;
                break;
            case 6:
                init_img =  R.drawable.board_6;
                break;
            case 7:
                init_img =  R.drawable.board_7;
                break;
            case 8:
                init_img =  R.drawable.board_8;
                break;
            case 9:
                init_img =  R.drawable.board_9;
                break;
            case 10:
                init_img =  R.drawable.board_10;
                break;
            case 11:
                init_img =  R.drawable.board_11;
                break;
            case 12:
                init_img =  R.drawable.board_12;
                break;
            case 13:
                init_img =  R.drawable.board_13;
                break;
            case 14:
                init_img =  R.drawable.board_14;
                break;
            case 15:
                init_img =  R.drawable.board_15;
                break;
            case 16:
                init_img =  R.drawable.board_16;
                break;
        }
        return init_img;
    }



}
