data Person = Person {firstName :: String,
                      motivation :: String,
                      experience :: String
                     } deriving (Show)
kai = Person "Kai" "I like to teach" "I am good in FP"
john = Person "John" "I'd like to learn about FP" "I am good in Java"

introduction person = do
    putStr $ firstName person
    putStr ": "
    putStr $ motivation person
    putStr " and "
    putStrLn $ experience person

teachers = [kai, john]

-- introduction kai
-- introduction john
-- mapM_ introduction teachers

--------------------------

f :: Ord a => [a] -> [a]
f []     = []
f (x:xs) = (f ys) ++ [x] ++ (f zs)
    where
        ys = [y | y <- xs, y <= x]
        zs = [z | z <- xs, z > x]


--------------------------

g :: [Int] -> [Int]
g [] = []
g (p:xs) = p : g [x | x <- xs, x `mod` p /= 0]

-- g [2..100]

----------------------

-- without type annotation
-- inferred: circs :: Floating a => [a] -> [a]
-- so that does not work with [Int] as input
circs [] = []
circs (n:ns) = 2 * pi * n : circs ns

circs' :: [Int] -> [Double]
circs' [] = []
circs' (n:ns) = 2 * pi * fromIntegral n : circs' ns

circ x = 2 * pi * x

--------------------------

map' :: (a -> b) -> [a] -> [b]
map' _ [] = []
map' f (x:xs) = f x : map' f xs

--------------------------

filter' test [] = []
filter' test (x:xs) = if test x
  then x:filter' test xs
  else   filter' test xs

--------------------------

sum' :: Num a => [a] -> a
sum' [] = 0
sum' (n:ns) = n + sum' ns

product' :: Num a => [a] -> a
product' [] = 1
product' (n:ns) = n * product' ns

or' :: [Bool] -> Bool
or' [] = False
or' (x:xs) = x || or' xs

and' :: [Bool] -> Bool
and' [] = True
and' (x:xs) = x && and' xs

concat' :: [[a]] -> [a]
concat' [] = []
concat' (x:xs) = x ++ concat' xs

-- p76f PiH
foldr' :: (a -> b -> b) -> b -> [a] -> b
foldr' f v [] = v
foldr' f v (x:xs) = f x (foldr' f v xs)

sum'' = foldr' (+) 0
product'' = foldr' (*) 1
or'' = foldr' (||) False
and'' = foldr' (&&) True
concat'' = foldr' (++) []

idLst = foldr' (:) []

--------------------------

fib :: Int -> Int
fib n = fibGen 0 1 n

fibGen :: Int -> Int -> Int -> Int
fibGen a b n = case n of
    0 -> a
    n -> fibGen b (a+b) (n-1)


fib' :: Int -> Int
fib' 0 = 0
fib' 1 = 1
fib' n = fib' (n-1) + fib' (n-2)

fibs :: [Int]
fibs = 0 : 1 : [ a + b | (a, b) <- zip fibs (tail fibs)]

--------------------------

reciprocal' :: Int -> Double
reciprocal' n = 1 / fromIntegral n

reciprocal :: Int -> Maybe Double
reciprocal n | n == 0 = Nothing
             | otherwise = Just (reciprocal' n)

----------------------------

asInt :: String -> Int
asInt xs = loop 0 xs

loop :: Int -> String -> Int
loop acc []     = acc
loop acc (x:xs) = loop (acc * 10 + read [x] :: Int) xs

----------------------------

fizz :: Int -> String
fizz n | n `mod` 15 == 0  = "FizzBuzz"
       | n `mod` 3  == 0  = "Fizz"
       | n `mod` 5  == 0  = "Buzz"
       | otherwise        = show n
 
fizzCall = mapM_ putStrLn $ map fizz [1..16]


fizzCall' = mapM_ putStrLn $ zipWith3 join (loop 3 "Fizz") (loop 5 "Buzz") [1..16]
  where
    xor s t = if null s then t else s
    loop n s = cycle $ replicate (n-1) [] ++ [s]
    join s t n = xor (s ++ t) (show n)

---

threes = cycle ["", "", "Fizz"]
fives  = cycle ["", "", "", "", "Buzz"]
numbers = map show [1..]

cycle' xs = xs ++ cycle' xs

fizzBuzz' = zipWith (++) threes fives

xor s t = if null s then t else s

fizzCall'' = mapM_ putStrLn $ take 10 $ zipWith (xor) fizzBuzz' numbers


fizzBuzz i = if null desc then show i else desc
  where 
    desc = concat [label | (j,label) <- tags, 0 == rem i j]
    tags = [ (3, "Fizz"), (5, "Buzz"), (7, "Baz") ]
 
fizzCall''' = mapM_ (putStrLn . fizzBuzz) [1..120]

----------------------------
