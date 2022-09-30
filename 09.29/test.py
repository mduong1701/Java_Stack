arr = [ 8, 1, 1231, 7, 5345, 4, 65756, 6, 4232, 3, 54645, 2, 64564, 5, 75675]

def longest_sub(arr):
    longest = 0
    set_arr = set(arr)
    for num in set_arr:
        if num - 1 not in set_arr:
            cur_longest = 1
            cur_num = num
            while cur_num + 1 in set_arr:
                cur_longest += 1
                cur_num += 1
            longest = max(longest, cur_longest)
    return longest

print(longest_sub(arr))


