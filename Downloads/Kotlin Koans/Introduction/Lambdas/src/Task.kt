fun containsEven(collection: Collection<Int>): Boolean =
        collection.any {
                for(i in collection){
                        if(i%2 == 0)
                                return true;
                }
                return false;
        }
