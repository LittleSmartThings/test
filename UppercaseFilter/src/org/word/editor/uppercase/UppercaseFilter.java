package org.word.editor.uppercase;

import org.openide.util.lookup.ServiceProvider;
import org.word.editor.api.WordFilter;

//ESBEN : FIX det lort!!

@ServiceProvider(service=WordFilter.class)
public class UppercaseFilter implements WordFilter {

    @Override
    public String process(String s) {
        return s.toUpperCase();
    }

}