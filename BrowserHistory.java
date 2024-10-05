import java.util.Deque;
import java.util.LinkedList;

/*
Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
Используйте Deque для хранения истории.
● visitSite(String site): Добавляет сайт в историю посещений.
● back(int steps): Возвращает название сайта, который был посещен
steps назад, или null, если таких шагов нет.
● getHistory(): Возвращает список сайтов в истории посещений, от
последнего посещенного к первому.

 */
public class BrowserHistory {
    private static Deque<String> history = new LinkedList<>();
    public static void visitSite(String site){
        history.addFirst(site);
    }
    public static String back(int step){
        if(step >= (history.size())) return null;
        else {
            return history.stream().skip(step).findFirst().orElse(null);
//            Deque<String> temp = new LinkedList<>();
//            for (int i = 0; i < step; i++) {
//                temp.addLast(history.pollFirst());
//            }
//            String result = history.getFirst();
//            while (!temp.isEmpty()){
//                history.addFirst(temp.pollLast());
//            }
//            return result;
        }
    }
    public static Deque getHistory(){
        return history;
    }
}
