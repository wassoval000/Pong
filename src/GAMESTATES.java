public class GAMESTATES {

    private static boolean isPlay = false;
    private static boolean isPause = false;
    private static boolean isMenu = true;
    private static boolean isEnd = false;
    private static int cScore = 0;
    private static int pScore = 0;

    /*
     *METHODS FOR SETTING AND RETURNING THE SCORES
     * FOR COMPUTER AND PLAYER
     */
    public static int getcScore(){
        return cScore;
    }

    public static int getpScore(){
        return pScore;
    }

    public static void increaseCScore(){
        cScore++;
    }

    public static void increasePScore(){
        pScore++;
    }

    /* GETTERS AND SETTERS FOR THE GAME CONTROLLERS

    */
    public static boolean isPlay(){
        return isPlay;
    }
    public static boolean isPause(){
        return isPause;
    }
    public static boolean isMenu(){
        return isMenu;
    }
    public static boolean isEnd(){
        return isEnd;
    }
    public static void startPlay(){
        isPlay = true;
    }
    public static void stopPlay(){
        isPlay = false;
    }
    public static void startMenu(){
        isMenu = true;
    }
    public static void stopMenu(){
        isMenu = false;
    }
    public static void startPause(){
        isPause = true;
    }
    public static void stopPause(){
        isPause = false;
    }
    public static void endGame(){
        isEnd = true;
    }
    public static void startGame(){
        isEnd = false;
    }

    /* METHODS FOR TOGGLING BETWEEN GAMESTATES

     */
    public static void togglePlay(){
        if(isPlay){
            isPlay = false;
        }
        else {
            isPlay = true;
        }
    }
    public static void togglePause(){
        if(isPause)
            isPause = false;
        else
            isPause = true;
    }
    public static void toggleMenu(){
        if(isMenu)
            isMenu = false;
        else
            isMenu = true;
    }


}
