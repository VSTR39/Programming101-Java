package wednesday;

import java.util.List;
import java.awt.*;

public class FunnyArraySorter {//@author Vasil Trifonov

	enum Operations {//iskam  da rabotish
		Subtraction, Division, None
	};

	final private int mPivot;//dsa da sda fd

	public FunnyArraySorter(final int pivot) {//field comment is required
		mPivot = pivot;
	}

	private List<Integer> naturalSort(List<Integer> array, int pivot, Operations operation) {
		int i = 0;
		int j = 0;
		int min = array.get(0);
		int temp = min;
		int comparisonValue = 0;//more comments are required

		for (i = 0; i < array.size(); i++) {
			for (j = i; j < array.size(); j++) {
				min = array.get(i);
				switch (operation) {
				case None: {
					comparisonValue = min;
				}
				case Subtraction: {
					comparisonValue = min - pivot;
				}
				case Division: {
					comparisonValue = min / pivot;
				}
				}
				if (comparisonValue > array.get(j)) {
					comparisonValue = array.get(j);
					temp = array.get(i);
					array.set(i, comparisonValue);
					array.set(j, temp);
				}
			}
		}
		return array;
	}

	private List<Integer> backwardsSort(List<Integer> array) {
		int i = 0;
		int j = 0;
		int max = array.get(0);
		int temp = max;
		for (i = 0; i < array.size(); i++) {
			for (j = i; j < array.size(); j++) {
				max = array.get(i);
				if (max < array.get(j)) {
					max = array.get(j);
					temp = array.get(i);
					array.set(i, max);
					array.set(j, temp);
				}
			}
		}
		return array;
	}

	List<Integer> reverseSort(List<Integer> array) {

		class ReverseSort extends FunnyArraySorter {

			public ReverseSort(int pivot) {
				super(pivot);
			}

			public List<Integer> sort(List<Integer> array) {
				return backwardsSort(array);
			}

		}
		;
		ReverseSort reverseSorter = new ReverseSort(mPivot);
		return reverseSorter.sort(array);
	}

	List<Integer> pivotSubstractionSort(List<Integer> array) {
		class PivotSubtractionSort extends FunnyArraySorter {
			public PivotSubtractionSort(int pivot) {
				super(pivot);
			}

			public List<Integer> sort(List<Integer> array) {
				return naturalSort(array, mPivot, Operations.Subtraction);
			}
		}
		;
		PivotSubtractionSort pivotSubtractionSorter = new PivotSubtractionSort(mPivot);
		return pivotSubtractionSorter.sort(array);

	}

	List<Integer> pivotDivisionSort(List<Integer> array) {
		class PivotDivisionSort extends FunnyArraySorter {
			public PivotDivisionSort(int pivot) {
				super(pivot);
			}

			public List<Integer> sort(List<Integer> array) {
				return naturalSort(array, mPivot, Operations.Division);
			}
		}
		;
		PivotDivisionSort pivotDivisionSorter = new PivotDivisionSort(mPivot);
		return pivotDivisionSorter.sort(array);

	}

}
