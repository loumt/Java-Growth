package cn.design;

import java.util.*;

public class BellEventTest {

    public static void main(String[] args) {
        BellEventSource source = new BellEventSource();

        TeachEventListener listener = new TeachEventListener();
        StuEventListener listener1 = new StuEventListener();

        source.addListener(listener);
        source.addListener(listener1);

        source.ring(true);
        System.out.println("---------");
        source.ring(false);

    }

}

//铃声事件类：用于封装事件源及一些与事件相关的参数
class RingEvent extends EventObject {

    private static final long serialVersionUID = 1L;
    //true表示上课铃声,false表示下课铃声
    private boolean sound;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}

//目标类：事件源，铃
class BellEventSource {
    private List<BellEventListener> listeners;

    public BellEventSource() {
        listeners = new ArrayList<BellEventListener>();
    }

    public void addListener(BellEventListener listener) {
        listeners.add(listener);
    }

    //事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
    public void ring(boolean sound) {
        System.out.println(sound ? "上课" : "下课" + "铃响了....");
        RingEvent e = new RingEvent(this, sound);
        notify(e);
    }

    //当事件发生时,通知绑定在该事件源上的所有监听器做出反应（调用事件处理方法）
    public void notify(RingEvent e) {
        Iterator<BellEventListener> iterable = listeners.iterator();
        while (iterable.hasNext()) {
            iterable.next().heardBell(e);
        }
    }
}


//抽象观察者类：铃声事件监听器
interface BellEventListener extends EventListener {
    //事件处理方法，听到铃声
    void heardBell(RingEvent e);
}

class TeachEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if (e.isSound()) {
            System.out.println("老师上课了...");
        } else {
            System.out.println("老师下课了...");
        }
    }
}

class StuEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if (e.isSound()) {
            System.out.println("同学上课了...");
        } else {
            System.out.println("同学下课了...");
        }
    }
}