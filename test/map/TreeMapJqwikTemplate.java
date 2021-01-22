package map;

import list.List;
import tuple.Tuple;


public class TreeMapJqwikTemplate extends ADTMapJqwikTemplate {

	@Override
	protected <K extends Comparable<K>,V> Map<K,V> empty() {
		return TreeMap.empty();
	}
	
	@Override
  protected <K extends Comparable<K>,V> Map<K,V> fromList(List<Tuple<K,V>> list) {
		return TreeMap.fromList(list);
	}
	
	@Override
  protected Map<String,Integer> wordFreq(String s) {
		return ListMap.wordMap(s);
	}
	
}
