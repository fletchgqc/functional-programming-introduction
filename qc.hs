import Test.QuickCheck
import Data.List (intersperse)

-- cf https://www.schoolofhaskell.com/user/pbv/an-introduction-to-quickcheck-testing

prop_revapp :: [Int] -> [Int] -> Bool
prop_revapp xs ys = reverse (xs++ys) == reverse xs ++ reverse ys

-- >  quickCheck prop_revapp

prop_revapp' xs ys = reverse (xs++ys) == reverse ys ++ reverse xs

-- >  quickCheck prop_revapp'

---------------

split c [] = []
split c xs = xs' : if null xs'' then [] else split c (tail xs'')
    where xs' = takeWhile (/=c) xs
          xs''= dropWhile (/=c) xs

unsplit :: Char -> [String] -> String
unsplit c = concat . intersperse [c]

prop_split_inv c xs = unsplit c (split c xs) == xs

-- >  quickCheck prop_split_inv

---------------

