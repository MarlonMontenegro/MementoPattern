package org.memento;

import java.util.ArrayList;
import java.util.List;

public class History {


    private final List<EditorState> stateList = new ArrayList<>();


    public void push(EditorState state) {

        stateList.add(state);

    }

    public EditorState pop() {

        var lastIndex = stateList.size() - 1;
        var lastState = stateList.get(lastIndex);

        stateList.remove(lastState);

        return lastState;

    }


}
